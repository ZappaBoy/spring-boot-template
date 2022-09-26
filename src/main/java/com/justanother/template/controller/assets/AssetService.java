package com.justanother.template.controller.assets;

import com.justanother.template.domain.dto.AssetDTO;
import com.justanother.template.domain.entity.Asset;
import com.justanother.template.utils.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {

    private final AssetRepository assetRepository;

    @Autowired
    public AssetService(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    public void saveAsset(AssetDTO assetDTO) {
        Asset asset = EntityMapper.map(assetDTO, Asset.class);
        assetRepository.save(asset);
    }

    public AssetDTO getAssetByUuid(String uuid) {
        Asset asset = assetRepository.findByUuid(uuid);
        return EntityMapper.map(asset, AssetDTO.class);
    }

    public void saveAssetList(List<AssetDTO> assetDTOList) {
        List<Asset> assetList = EntityMapper.mapAll(assetDTOList, Asset.class);
        assetRepository.saveAll(assetList);
    }

    public List<AssetDTO> getAssetListByUuids(List<String> uuids) {
        List<Asset> assetList = assetRepository.findByUuidIn(uuids);
        return EntityMapper.mapAll(assetList, AssetDTO.class);
    }
}
