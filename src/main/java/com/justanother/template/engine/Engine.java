package com.justanother.template.engine;

import com.justanother.template.config.EngineConfig;
import com.justanother.template.controller.assets.AssetController;
import com.justanother.template.domain.dto.AssetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Engine {

    private final EngineConfig engineConfig;
    private final AssetController assetController;
    private final List<AssetDTO> initialAssetDTOList = new ArrayList<>();

    @Autowired
    public Engine(EngineConfig engineConfig, AssetController assetController) {
        this.engineConfig = engineConfig;
        this.assetController = assetController;
    }

    public void startEngine() {
        System.out.println("Engine started");

        int initialAssetsNumber = this.engineConfig.getInitialAssetsNumber();
        for (int i = 0; i < initialAssetsNumber; i++) {
            AssetDTO assetDTO = new AssetDTO();
            assetDTO.setUuid("uuid" + i);
            assetDTO.setDescription("description" + i);
            initialAssetDTOList.add(assetDTO);
        }

        assetController.saveAssetList(initialAssetDTOList);
    }

}
