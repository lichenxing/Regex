/**
 * �����ж��û�������ַ����Ƿ�����ض����ַ�����
 * ʹ��������ʽ������Log4j����debug��
 */

package com.telek.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class RegexTest {

	/**
	 * @param args
	 */
	static Log log = LogFactory.getLog(RegexTest.class);

	public static void main(String[] args) {
		String inputString = JOptionPane.showInputDialog("��������Ҫƥ����ַ�����");
		log.info(inputString);

		boolean isMatcher = matchRegex(inputString);

		log.info(isMatcher);
	}

	private static final String regex = "^Java.*";

	public static boolean matchRegex(String inputString) {

		Pattern pattern = Pattern.compile(regex);

		log.info(pattern);
		Matcher matcher = pattern.matcher(inputString);

		log.info(matcher);

		boolean isMatch = matcher.matches();

		log.info(isMatch);

		return isMatch;

	}

}
