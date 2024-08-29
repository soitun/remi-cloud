package ai.remi.sys.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ai.remi.sys.domain.entity.Area;
import ai.remi.sys.infra.mapper.AreaMapper;
import ai.remi.sys.server.service.AreaService;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 省市县表(Area)服务实现层
 */
@Service("areaService")
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements AreaService {

}

