package ai.remi.sys.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ai.remi.sys.domain.entity.RefreshToken;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 刷新令牌表(RefreshToken)数据层
 */
@Mapper
public interface RefreshTokenMapper extends BaseMapper<RefreshToken> {

}
