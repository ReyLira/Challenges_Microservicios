package com.example.vallegrande.domain;

import java.util.List;

public interface CertificateService {
    List<Certificate> listarTodos();

    Certificate save(Certificate certificate);

    Certificate update(Certificate certificate);

    void delete(Integer id);
}
