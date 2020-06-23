import pytest
import test_actitime_username

def test_HomeUrl(test_common,test_checkurl):
    test_actitime_username.test_login(test_checkurl,test_common)
    print(test_common[0].current_url)
    test_common[0].find_element_by_xpath("//a[@id='logoutLink']").click()
    test_common[0].close()




