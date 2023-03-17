package com.example.vallegrande.application;

import com.example.vallegrande.domain.Certificate;
import com.example.vallegrande.domain.CertificateRepository;
import com.example.vallegrande.domain.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateImpl implements CertificateService {


    @Autowired
    private  CertificateRepository certificateRepository;
    @Override
    public List<Certificate> listarTodos() {
        return certificateRepository.findAll() ;
    }

    @Override
    public Certificate save(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public Certificate update(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    @Override
    public void delete(Integer id) {
        certificateRepository.deleteById(id);
    }
}
