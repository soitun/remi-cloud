package ai.remi.sys.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ai.remi.sys.domain.entity.Dept;
import ai.remi.sys.infra.mapper.DeptMapper;
import ai.remi.sys.server.service.DeptService;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 部门表(Dept)服务实现层
 */
@Service("deptService")
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}

