package me.zyly.riska.core.repository;

import me.zyly.riska.core.domain.Admin;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by hanzhe on 2017/7/21.
 */
public interface AdminRepository extends PagingAndSortingRepository<Admin, String> {
    Admin findByLoginName(String loginName);

    Admin findByLoginNameAndPassword(String loginName, String password);
}
