package com.dimple.system.domain;

import com.dimple.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @className SysNotice
 * @description 通知公告表 sys_notice
 * @auther Dimple
 * @date 2019/3/13
 * @Version 1.0
 */
@Data
public class SysNotice extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 公告ID
     */
    private Long noticeId;

    /**
     * 公告标题
     */
    private String noticeTitle;

    /**
     * 公告类型（1通知 2公告）
     */
    private String noticeType;

    /**
     * 公告内容
     */
    private String noticeContent;

    /**
     * 公告状态（0正常 1关闭）
     */
    private String status;
}