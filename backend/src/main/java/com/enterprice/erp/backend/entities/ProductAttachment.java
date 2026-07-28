package com.enterprice.erp.backend.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_attachments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductAttachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileName; // اسم الملف (مثال: Samsung-Invoice-2026.pdf)

    @Column(nullable = false)
    private String fileType; // نوعه (INVOICE فاتورة, MSDS سلامة, WARRANTY ضمان)

    @Column(nullable = false)
    private String filePath; // مكان حفظ الـ PDF (وهذا هو الرابط الذي سيقرأ منه نظام الـ RAG لاحقاً!)

    private String fileSize; // حجم الملف

    @Column(name = "uploaded_at", updatable = false)
    private LocalDateTime uploadedAt; // وقت وتاريخ الرفع تلقائياً

    // الربط اللوجستي: هذا الملف المرفق يتبع منتجاً معيناً في المخزن
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @PrePersist
    protected void onCreate() {
        this.uploadedAt = LocalDateTime.now();
    }
}