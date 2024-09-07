package com.xq.weblog.admin.service;


import com.xq.weblog.admin.model.vo.tag.AddTagReqVO;
import com.xq.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.xq.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.xq.weblog.admin.model.vo.tag.SearchTagsReqVO;
import com.xq.weblog.common.utils.PageResponse;
import com.xq.weblog.common.utils.Response;

/**
 * @description: TODO
 **/
public interface AdminTagService {

    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键词模糊查询
     * @param searchTagsReqVO
     * @return
     */
    Response searchTags(SearchTagsReqVO searchTagsReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();
}
