package com.saas.sync.service;

import com.saas.sync.entity.UserMember;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 会员service
 * @author sujian
 */
@Repository
public interface UserMemberService {
    /**
     * 查询会员信息
     *
     * @param map
     * @return
     */
    List<UserMember> selectUserMember(Map<String, Object> map);

    /**
     * 新增会员信息
     *
     * @param userMember
     */
    void insertUserMember(UserMember userMember);

    /**
     * 修改会员信息
     *
     * @param userMember
     */
    void updateUserMember(UserMember userMember);

    /**
     * 根据门店查询本月生日人数
     * @param map key：storeIds
     * @return
     */
    Integer selectMemberBirthdayCount(Map<String, Object> map);

    /**
     * 会员表中增加总积分
     * @param userMember 会员信息
     */
    void updateIntegral(UserMember userMember);

    /**
     * 获取会员数
     * @param map key:dateTime,storeIds
     * @return
     */
    Integer selectUserMemberCount(Map<String, Object> map);

    /**
     * 获取有效会籍数
     * @param map key:dateTime,storeIds
     * @return
     */
    Integer selectMembershipCount(Map<String, Object> map);

    /**
     * 查询课程信息
     * @param memberId
     * @return
     */
    List<Class> selectClass(String memberId, Long categoryId);

    /**
     * 用户批量新增
     * @param userMembers
     */
    void insertUserMemberBatch(List<UserMember> userMembers);

    /**
     * 同步会员
     */
    void synchronizationMember() throws Exception;
}
