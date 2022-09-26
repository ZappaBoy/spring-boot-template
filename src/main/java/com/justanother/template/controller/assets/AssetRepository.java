package com.justanother.template.controller.assets;

import com.justanother.template.domain.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetRepository extends JpaRepository<Asset, String> {

    Asset findByUuid(String uuid);

    List<Asset> findByUuidIn(List<String> uuids);
}
