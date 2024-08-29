package ai.remi.sys.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ai.remi.sys.domain.entity.DeptUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 部门用户表(DeptUser)数据层
 */
@Mapper
public interface DeptUserMapper extends BaseMapper<DeptUser> {

}
