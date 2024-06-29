package com.sanjin.springbootinit.socring;

import com.sanjin.springbootinit.model.entity.App;
import com.sanjin.springbootinit.model.entity.UserAnswer;

import java.util.List;

/**
 * @BelongsProject: yidada-backend
 * @BelongsPackage: com.sanjin.springbootinit.socring
 * @Author: San Jin
 * @CreateTime: 2024-06-29 22:02
 * @Version: 1.0
 */
public class CustomTestScoringStrategy implements ScoringStrategy {
    @Override
    public UserAnswer doScore(List<String> choice, App app) throws Exception {
        return null;
    }
}
