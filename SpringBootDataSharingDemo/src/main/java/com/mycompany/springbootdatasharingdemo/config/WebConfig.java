/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springbootdatasharingdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

/**
 *
 * @author 20113
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // Thêm các mapping view tĩnh (nếu cần)
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // registry.addViewController("/about").setViewName("about");
    }

    // Chia sẻ dữ liệu chung với tất cả view
    @ModelAttribute
    public void addGlobalAttributes(Model model) {
        model.addAttribute("appName", "Spring Boot Data Sharing Demo");
        model.addAttribute("footer", "© 2025 - Lập trình Java nâng cao");
    }
}
