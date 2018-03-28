package com.suixingpay.datas.manager.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.suixingpay.datas.manager.core.entity.Nodes;
import com.suixingpay.datas.manager.web.page.Page;

/**
 * 节点信息表 Mapper接口
 * 
 * @author: FairyHood
 * @date: 2018-03-07 13:40:30
 * @version: V1.0-auto
 * @review: FairyHood/2018-03-07 13:40:30
 */
public interface NodesMapper {

    /**
     * 新增
     * 
     * @param nodes
     */
    Integer insert(Nodes nodes);

    /**
     * 修改
     * 
     * @param nodes
     */
    Integer update(@Param("id") Long id, @Param("nodes") Nodes nodes);

    /**
     * 刪除
     * 
     * @param id
     * @return
     */
    Integer delete(Long id);

    /**
     * 作废
     * 
     * @param id
     * @return
     */
    Integer cancel(Long id);

    /**
     * 任务推送状态
     * 
     * @param id
     * @param taskPushState
     * @return
     */
    Integer taskPushState(@Param("id") Long id, @Param("taskPushState") String taskPushState);

    /**
     * 根據主鍵id查找數據
     * 
     * @param id
     * @return
     */
    Nodes selectById(Long id);

    /**
     * 分頁
     * 
     * @return
     */
    List<Nodes> page(@Param("page") Page<Nodes> page, @Param("ipAddress") String ipAddress,
            @Param("state") Integer state, @Param("machineName") String machineName);

    /**
     * 分頁All
     * 
     * @return
     * @param ipAddress
     * @param state
     * @param machineName
     * @param type
     */
    Integer pageAll(@Param("ipAddress") String ipAddress, @Param("state") Integer state,
            @Param("machineName") String machineName);

    Integer insertState(@Param("nodeId") String nodeId, @Param("machineName") String machineName,
            @Param("ipAddress") String ipAddress, @Param("pidNumber") String pidNumber,
            @Param("heartBeatTime") String heartBeatTime, @Param("state") Integer state);

    /**
     * 节点状态
     * 
     * @param id
     * @param state
     * @return
     */
    Integer updateState(@Param("nodeId") String nodeId, @Param("machineName") String machineName,
            @Param("ipAddress") String ipAddress, @Param("pidNumber") String pidNumber,
            @Param("heartBeatTime") String heartBeatTime, @Param("state") Integer state);

    /**
     * 修改心跳时间并且变更节点状态
     * 
     * @param id
     * @param heartBeatTime
     * @return
     */
    Integer updateHeartBeatTime(@Param("nodeId") String nodeId, @Param("machineName") String machineName,
            @Param("ipAddress") String ipAddress, @Param("pidNumber") String pidNumber,
            @Param("heartBeatTime") String heartBeatTime);
}