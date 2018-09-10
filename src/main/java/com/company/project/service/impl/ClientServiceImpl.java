package com.company.project.service.impl;

import com.company.project.dao.ClientMapper;
import com.company.project.model.Client;
import com.company.project.service.ClientService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/09/10.
 */
@Service
@Transactional
public class ClientServiceImpl extends AbstractService<Client> implements ClientService {
    @Resource
    private ClientMapper clientMapper;

}
