package com.sanjin.springbootinit.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 审核请求
 *
 * 
 
 */
@Data
public class ReviewRequest implements Serializable {

    /**
     * id
     */
    private Long id;


    /**
     * 审核状态 0-未审核 , 1-通过 , 2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;

    private static final long serialVersionUID = 1L;
}