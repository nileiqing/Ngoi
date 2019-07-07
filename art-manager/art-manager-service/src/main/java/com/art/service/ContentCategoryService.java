package com.art.service;

import java.util.List;

import com.art.common.pojo.ArtResult;
import com.art.common.pojo.EUTreeNode;

public interface ContentCategoryService {
    /**
     * 于立波
     * 列出所有的内容节点
     * @param parentId
     * @return
     */
	List<EUTreeNode> getCategoryList(long parentId);
	/**
	 *于立波
     * 添加内容分类节点
	 * @param parentId
	 * @param name
	 * @return
	 */
	ArtResult  insertContentCategory(long parentId, String name);
	/**
	 *于立波
     * 重命名节点
	 * @param id
	 * @param name
	 * @return
	 */
	ArtResult  updateContentCategory(long id, String name);
	/**
	 * 于立波
	 * 删除节点
	 * 接收parentid、id两个参数。删除id对应的记录。需要判断parentid对应的记录下是否有子节点。如果没有子节点。需要把parentid对应的记录的isparent改成false。
     * 注意：删除直接是物理删除。
	 * @param parentId
	 * @param id
	 * @return
	 */
	ArtResult deleteContentCategory(Long parentId, Long id);
}
