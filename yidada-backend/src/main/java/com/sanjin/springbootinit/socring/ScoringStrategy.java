package com.sanjin.springbootinit.socring;

import com.sanjin.springbootinit.model.entity.App;
import com.sanjin.springbootinit.model.entity.UserAnswer;

import java.util.List;

/**
 * @BelongsProject: yidada-backend
 * @BelongsPackage: com.sanjin.springbootinit.socring
 * @Author: San Jin
 * @CreateTime: 2024-06-29 21:57
 * @Version: 1.0
 *  评分策略
 */
public interface ScoringStrategy {

    UserAnswer doScore(List<String> choice , App app) throws Exception;



}
