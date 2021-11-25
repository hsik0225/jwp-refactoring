package kitchenpos.menu.application;

import kitchenpos.menu.repository.MenuGroupDao;
import kitchenpos.menu.domain.MenuGroup;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuGroupService {
    private final MenuGroupDao menuGroupDao;

    public MenuGroupService(final MenuGroupDao menuGroupDao) {
        this.menuGroupDao = menuGroupDao;
    }

    @Transactional
    public MenuGroup create(final MenuGroup menuGroup) {
        return menuGroupDao.save(menuGroup);
    }

    public List<MenuGroup> list() {
        return menuGroupDao.findAll();
    }

    public MenuGroup findById(Long id) {
        return menuGroupDao.findById(id)
                           .orElseThrow(() -> new IllegalArgumentException("MenuGroupId에 해당하는 메뉴 그룹이 존재하지 않습니다."));
    }
}