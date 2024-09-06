package com.fiuni.distri.project.fiuni.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class BaseDto implements Serializable {

    private int id;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
