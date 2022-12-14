package com.justanother.template.controller.assets;

import com.justanother.template.domain.dto.AssetDTO;
import com.justanother.template.domain.response.ResultMessageResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AssetController {

    private final AssetService assetService;

    @Autowired
    public AssetController(AssetService assetService) {
        this.assetService = assetService;
    }

    public void saveAsset(AssetDTO assetDTO) {
        assetService.saveAsset(assetDTO);
    }

    public AssetDTO getAssetByUuid(String uuid) {
        return assetService.getAssetByUuid(uuid);
    }

    public void saveAssetList(List<AssetDTO> assetDTOList) {
        assetService.saveAssetList(assetDTOList);
    }

    public List<AssetDTO> getAssetListByUuids(List<String> uuids) {
        return assetService.getAssetListByUuids(uuids);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<AssetDTO> findAssetByUuid(
            @PathVariable(value = "uuid") String uuid
    ) {
        return new ResponseEntity<>(getAssetByUuid(uuid), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<ResultMessageResponseDTO> newAsset(@RequestBody AssetDTO newAssetDTO) {
        assetService.saveAsset(newAssetDTO);
        ResultMessageResponseDTO responseDTO = new ResultMessageResponseDTO();
        responseDTO.setMessage("Asset created");
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
