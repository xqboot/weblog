package com.xq.weblog.admin.convert;

import com.xq.weblog.admin.model.vo.wiki.FindWikiPageListRspVO;
import com.xq.weblog.common.domain.dos.WikiDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author: xq
 * @date: 2023/10/8 14:57
 * @description: 知识库实体类转换
 **/
@Mapper
public interface WikiConvert {
    /**
     * 初始化 convert 实例
     */
    WikiConvert INSTANCE = Mappers.getMapper(WikiConvert.class);

    /**
     * WikiDO -> FindWikiPageListRspVO
     * @param bean
     * @return
     */
    @Mapping(target = "isTop", expression = "java(bean.getWeight() > 0)")
    FindWikiPageListRspVO convertDO2VO(WikiDO bean);

}
