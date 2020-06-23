import pytest
from selenium import webdriver
@pytest.fixture
def test_common():
    driver = webdriver.Chrome(executable_path=r"C:\\Users\\Kothiya.kuman\\Desktop\\Testing\\selenium_sw\\chromedriver_win32 (2)\\chromedriver.exe")

    return [driver]

@pytest.fixture
def test_checkurl(test_common):
    return[test_common[0].get("https://online.actitime.com/tcs1/login.do")]

@pytest.fixture
def test_url(test_common):
    return[test_common[0].get("https://www.google.com/search?q=news&rlz=1C1GCEV_enIN859IN859&oq=news&aqs=chrome.0.69i59j0l4j69i60l3.924j1j4&sourceid=chrome&ie=UTF-8")]


@pytest.fixture
def test_googleurl(test_common):
    return [test_common[0].get("https://www.google.com")]

@pytest.fixture
def test_select(test_common):
    return [test_common[0].get("file://C:/Users/Kothiya.kuman/Desktop/Testing/selenium%20prog/multiselect_list.html")]

@pytest.fixture
def test_dropdown(test_common):
    return [test_common[0].get("https://www.actimind.com/")]

@pytest.fixture
def test_dragdrop(test_common):
    return [test_common[0].get("https://jqueryui.com/draggable/#sortable")]

@pytest.fixture
def test_alert(test_common):
    return [test_common[0].get("https://gsrtc.in/site/")]

@pytest.fixture
def test_hidden_popup(test_common):
    return [test_common[0].get("https://www.cleartrip.com/")]

@pytest.fixture
def test_window_popup(test_common):
    return [test_common[0].get("https://www.naukri.com/")]