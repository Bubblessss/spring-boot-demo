package com.zh.springbootelasticsearch;

import com.zh.springbootelasticsearch.model.Product;
import com.zh.springbootelasticsearch.repository.ProductRepository;
import com.zh.springbootelasticsearch.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootElasticsearchApplicationTests {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void saveTest() {
        Product product = this.productService.getProduct();
        this.productRepository.save(product);
    }

    @Test
    public void saveListTest() {
        List<Product> list = this.productService.listProduct();
        this.productRepository.saveAll(list);
    }

    @Test
    public void deleteDocumentTest() {
        this.productRepository.deleteById("2581fef991a04f8bb4ad71f68dcf7a0f");
    }


    @Test
    public void updateTest() {
        Product product = this.productRepository.findById("eae1916e6d0a493e86ca662b1d4052ee").get();
        product.setName("X30");
        this.productRepository.save(product);
    }

    @Test
    public void updateListTest() {
        List<Product> list = this.productRepository.findByBrand("华为");
        list.forEach(System.out :: println);
        list = list.stream()
                   .filter(e -> e.getCategory().equals("手机"))
                   .peek(e -> e.setCategory("电脑"))
                   .collect(Collectors.toList());
        this.productRepository.saveAll(list);
        log.info("====================更新后====================");
        list = this.productRepository.findByBrand("华为");
        list.forEach(System.out :: println);
    }

    @Test
    public void searchTest1() {
        Page<Product> page = this.productRepository.findAll(PageRequest.of(0,10,Sort.Direction.ASC,"createTime"));
        page.get().forEach(System.out :: println);
    }

    @Test
    public void searchTest2() {
        Page<Product> page = this.productRepository.findByCategoryOrderByCreateTimeDesc("电脑",PageRequest.of(0,10));
        page.get().forEach(System.out :: println);
    }

    @Test
    public void searchTest3() {
        List<Product> list = this.productRepository.findByCreateTimeBetween("2018-01-01 00:00:00","2019-12-31 00:00:00");
        list.forEach(System.out :: println);
    }

    @Test
    public void searchTest4() {
        List<Product> list = this.productService.findByValue("华为游戏");
        list.forEach(System.out :: println);
        log.info("=========================================================");
        list = this.productService.findByValue("耐克鞋",PageRequest.of(0,20,Sort.Direction.DESC,"createTime"));
        list.forEach(System.out :: println);
    }
}

