package com.YeongJin.jdbc.raw;

import java.util.List;

import com.YeongJin.jdbc.template.ArticleDaoImplUsingTemplate;

public class ArticleMain {
	ArticleDao articleDao = new ArticleDaoImplUsingTemplate();
	
	public static void main(String[] args) {
		new ArticleMain().getArticle();
	}
	
	public void listArticles() {
		List<Article> articles = articleDao.listArticles();
		System.out.println(articles);
	}
	
	public void getArticle() {
		Article article = articleDao.getArticle("3");
		System.out.println(article);
	}
	
	public void addArticles() {
		Article article = new Article();
		article.setTitle("제목.");
		article.setContent("내용");
		article.setUserId("1");
		article.setName("박영진");
		articleDao.addArticle(article);
	}
	
	public void updateArticle() {
		Article article = new Article();
		article.setArticleId("7");
		article.setTitle("This is modified title.");
		article.setContent("This is modified content");
		articleDao.updateArticle(article);
	}
	
	public void deleteArticle() {
		articleDao.deleteArticle("4");
	}
}
