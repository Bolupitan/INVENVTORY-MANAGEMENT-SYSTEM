package com.stockhub.InventoryManagementSystem.Controllers;

import com.stockhub.InventoryManagementSystem.adapters.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {
    protected ResponseEntity<?> ok(Object data) {
        return ResponseEntity.ok(new ApiResponse(true, "Success", data));
    }

    protected ResponseEntity<?> created(Object data) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ApiResponse(true, "Created successfully", data));
    }

    protected ResponseEntity<?> deleted() {
        return ResponseEntity.ok(new ApiResponse(true, "Deleted successfully", null));
    }

    protected ResponseEntity<?> notFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiResponse(false, "Not found", null));
    }
}
