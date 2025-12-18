package com.example.demo.controller;

import com.example.demo.entity.AssetClass;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/asset-classes")
public class AssetClassController {

    @GetMapping
    public AssetClass[] getAllAssetClasses() {
        return AssetClass.values();
    }
}
