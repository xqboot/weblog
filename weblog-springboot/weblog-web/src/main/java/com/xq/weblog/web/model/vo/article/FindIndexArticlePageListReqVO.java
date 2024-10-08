package com.xq.weblog.web.model.vo.article;

import com.xq.weblog.common.model.BasePageQuery;
import com.xq.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author: xq
 * @date: 2023-09-15 14:07
 * @description: 首页-文章分页
 **/
@Data
@Builder
@ApiModel(value = "首页查询文章分页 VO")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}
