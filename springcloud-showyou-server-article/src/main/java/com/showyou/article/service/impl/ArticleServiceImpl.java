package com.showyou.article.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.showyou.article.dao.ArticleDao;
import com.showyou.article.domain.Article;
import com.showyou.article.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public List<Article> getAllArticle() {
		return articleDao.selectAllArticle();
	}

	@Override
	public int saveArticle(Article article) {
		return articleDao.addArticle(article);
	}

}
