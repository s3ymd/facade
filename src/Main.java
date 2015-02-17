import java.io.IOException;

import org.apache.commons.codec.net.URLCodec;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	public static void main(String[] args) throws IOException {
		String keyword = "天気";
		String encodedKeyword = new URLCodec().encode(keyword, "UTF-8");
		String url = String.format("http://www.bing.com/news/search?q=%s", encodedKeyword);
		Document doc = Jsoup.connect(url).get();
		Elements titles = doc.select(".newstitle");
		for (Element title: titles) {
			System.out.println(title.text());
		}
	}
}

//class SearchEngine {
//	private Document doc;
//	public void search(String keyword) throws IOException {
//	}
//	public List<String> select(String selector) {
//	}
//}

