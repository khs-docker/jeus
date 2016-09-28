CLASSPATH=$(JEUS_HOME)/classes:.

JAVAC=$(JAVA_HOME)/bin/javac
#JFLAGS= -deprecation -classpath $(CLASSPATH)
OUTPUTDIR=../WEB-INF/classes
JFLAGS= -classpath $(CLASSPATH) -d $(OUTPUTDIR)

SOURCES =  \
	CookieTest.java \
	DriverTest.java \
	ForwardTest1.java \
	ForwardTest2.java \
	ForwardedPage.java \
	IncludeTest1.java \
	IncludeTest2.java \
	IncludedPage.java \
	RedirectTest.java \
	RequestHeaderTest.java \
	RequestInfoTest.java \
	RequestParamTest.java \
	ServletContextTest.java \
	SessionTest.java \
	SharedThreadModelTest.java \
	SingleThreadModelTest.java \
	SingleThreadModelTest2.java \
	checkbox/CheckTest.java \
	customtag/EncodeHtmlTag.java \
	filters/HitCounterFilter.java \
	filters/Counter.java \
	filters/CharResponseWrapper.java \
	javabeans/StatBean.java \
	listeners/SessionListenerTest.java \
	listeners/ContextListener.java \
	listeners/SessionListener.java \
	listeners/ContextListenerTest.java \
	listeners/ContextListener2.java \
	listeners/SessionListener2.java \
	listeners/SessionAttributeListener.java \
	listeners/SessionActivationListener.java \
	num/NumberGuessBean.java \
	sessions/Cart.java

#	customtag12/ShowDateTag.java \
#	customtag12/ShowDateTei.java \
#	KoreanTest.java \

CLASSES=${SOURCES:.java=.class}

.SUFFIXES:
.SUFFIXES: .class .java

.java.class:
	$(JAVAC) $(JFLAGS) $<

all: $(CLASSES)

clean:
	find . -name "*.class" -exec rm {} \;
