package com.saas.sync.mapper;

import com.saas.sync.entity.UserMember;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 会员dao
 * @author sujian
 */
@Repository
public interface UserMemberMapper {
    /**
     * 查询会员信息
     * @param map
     * @return
     */
    List<UserMember> selectUserMember(Map<String, Object> map);

    /**
     * 新增会员信息
     * @param userMember
     */
    void insertUserMember(UserMember userMember);

    /**
     * 修改会员信息
     * @param userMember
     */
    void updateUserMember(UserMember userMember);

    /**
     * 根据门店查询本月生日人数
     * @param map key：storeIds,dateTime
     * @return
     */
    Integer selectMemberBirthdayCount(Map<String, Object> map);

    /**
     * 会员表中增加总积分
     * @param userMember 会员信息
     */
    void updateIntegral(UserMember userMember);

    /**
     * 用户批量新增
     * @param userMembers
     */
    void insertUserMemberBatch(List<UserMember> userMembers);

}
