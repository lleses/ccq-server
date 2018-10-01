package cn.dl.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dl.app.dao.UserDao;
import cn.dl.app.entity.User;

/**
 * 用户
 */
@Service
@Transactional(readOnly = true)
public class UserService {

	@Autowired
	private UserDao dao;

	@Transactional
	public Integer add(User user) {
		dao.add(user);
		if (user != null && user.getId() != null) {
			return user.getId();
		}
		return null;
	}

	@Transactional
	public void update(User user) {
		if (user.getId() != null) {
			dao.update(user);
		}
	}

	public User getByPhone(String phone) {
		if (phone != null) {
			User user = dao.getByPhone(phone);
			return user;
		}
		return null;
	}

	public User getByInvitationCode(String invitationCode) {
		if (invitationCode != null) {
			User user = dao.getByPhone(invitationCode);
			return user;
		}
		return null;
	}

}