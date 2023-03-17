package com.example.vallegrande.rest;

import com.example.vallegrande.domain.Certificate;
import com.example.vallegrande.domain.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Challenge/v1/certificated")
public class CertificateController {
    @Autowired
    private CertificateService certificateService;
    @GetMapping
    public List<Certificate> listar() {
        return certificateService.listarTodos();
    }
    @PostMapping
    public Certificate create(@RequestBody Certificate certificate){
        return certificateService.save(certificate);
    }

    @PutMapping
    public Certificate update(@RequestBody Certificate certificate){
        return certificateService.save(certificate);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        certificateService.delete(id);
    }
}
