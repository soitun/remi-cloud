package ai.remi.sys.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ai.remi.sys.domain.entity.RestrictIp;
import ai.remi.sys.infra.mapper.RestrictIpMapper;
import ai.remi.sys.server.service.RestrictIpService;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 黑白名单表(RestrictIp)服务实现层
 */
@Service("restrictIpService")
public class RestrictIpServiceImpl extends ServiceImpl<RestrictIpMapper, RestrictIp> implements RestrictIpService {

}

