package com.liangzai.community.mapper;

import com.liangzai.community.model.Question;
import com.liangzai.community.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface QuestionExtMapper {

    int incView(Question record);
}