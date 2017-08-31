package top.zywork.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.zywork.dos.TemplateDO;

/**
 * Created by Wang Genshen on 2017-08-31.
 */
@Repository
public interface TemplateDAO extends JpaRepository<TemplateDO, Long> {
}
