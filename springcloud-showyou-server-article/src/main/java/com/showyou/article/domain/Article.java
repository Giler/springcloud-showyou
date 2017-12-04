package com.showyou.article.domain;

public class Article {
	private Integer id;//文章ID
	private String title;//标题
	private String label;//标签
	private String articleAbstract;//文章摘要
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getArticleAbstract() {
		return articleAbstract;
	}
	public void setArticleAbstract(String articleAbstract) {
		this.articleAbstract = articleAbstract;
	}
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", label=" + label + ", articleAbstract=" + articleAbstract
				+ "]";
	}
	
	
}

