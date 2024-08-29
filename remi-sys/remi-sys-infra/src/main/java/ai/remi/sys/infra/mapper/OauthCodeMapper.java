package ai.remi.sys.infra.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ai.remi.sys.domain.entity.OauthCode;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 授权码表(OauthCode)数据层
 */
@Mapper
public interface OauthCodeMapper extends BaseMapper<OauthCode> {

}
