package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitReqDTO;
import com.antamstoreapi.antamstorespbapi.service.unit.IUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/units")
public class UnitAPI {
    @Autowired
    private IUnitService unitService;

    @PostMapping
    public ResponseEntity<?> createUnit(@RequestBody UnitReqDTO unit) {
        return new ResponseEntity<>(unitService.createUnit(unit.getNameUnit()), HttpStatus.CREATED);
    }

    @GetMapping("/{idUnit}")
    public ResponseEntity<?> findUnitById(@PathVariable String idUnit) {
        return new ResponseEntity<>(unitService.findById(idUnit).getName(), HttpStatus.OK);
    }

    @DeleteMapping("/{idUnit}")
    public ResponseEntity<?> deleteUnitById(@PathVariable String idUnit) {
        unitService.deleteUnitById(idUnit);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
