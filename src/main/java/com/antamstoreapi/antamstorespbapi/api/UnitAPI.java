package com.antamstoreapi.antamstorespbapi.api;

import com.antamstoreapi.antamstorespbapi.domain.dto.unit.UnitReqDTO;
import com.antamstoreapi.antamstorespbapi.service.unit.IUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/units")
public class UnitAPI {
    @Autowired
    private IUnitService unitService;

    @PostMapping
    public ResponseEntity<?> createUnit(@RequestBody UnitReqDTO req) {
        return new ResponseEntity<>(unitService.createUnit(req.getNameUnit()), HttpStatus.CREATED);
    }

    @GetMapping("/{idUnit}")
    public ResponseEntity<?> findUnitById(@PathVariable String idUnit) {
        return new ResponseEntity<>(unitService.findById(idUnit).getName(), HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<?> getAllUnit( Pageable pageable) {
        return new ResponseEntity<>(unitService.getAllUnit(pageable), HttpStatus.OK);
    }
    @GetMapping("/admin")
    public ResponseEntity<?> getAllUnit( ) {
        return new ResponseEntity<>(unitService.getAllUnit(), HttpStatus.OK);
    }

    @DeleteMapping("/{idUnit}")
    public ResponseEntity<?> deleteUnitById(@PathVariable String idUnit) {
        unitService.deleteUnitById(idUnit);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{idUnit}")
    public ResponseEntity<?> updateUnitById(@PathVariable String idUnit, @RequestBody UnitReqDTO req) {
        unitService.updateUnitById(req, idUnit);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
