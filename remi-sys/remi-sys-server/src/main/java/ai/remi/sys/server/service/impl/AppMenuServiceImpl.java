package ai.remi.sys.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import ai.remi.sys.domain.entity.AppMenu;
import ai.remi.sys.infra.mapper.AppMenuMapper;
import ai.remi.sys.server.service.AppMenuService;
import org.springframework.stereotype.Service;

/**
 * @author DianJiu
 * @email dianjiuxyz@gmail.com
 * @desc 应用菜单表(AppMenu)服务实现层
 */
@Service("appMenuService")
public class AppMenuServiceImpl extends ServiceImpl<AppMenuMapper, AppMenu> implements AppMenuService {

}

