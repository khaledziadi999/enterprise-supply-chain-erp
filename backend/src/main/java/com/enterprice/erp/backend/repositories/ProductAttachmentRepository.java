package com.enterprice.erp.backend.repositories;

import com.enterprice.erp.backend.entities.ProductAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductAttachmentRepository extends JpaRepository<ProductAttachment, Long> {
    //rag pdfs

    List<ProductAttachment> findByProductId(Long productId);
}