package sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.export.annotation.AnnotationJmxAttributeSource;
import org.springframework.jmx.export.assembler.MetadataMBeanInfoAssembler;
import org.springframework.jmx.export.naming.MetadataNamingStrategy;

@Configuration
public class Config {

	@Bean
	public MyOptions myOptions() {
		return new MyOptions();
	}

	@Bean
	JMXDemo jmxDemoMBean() {
		System.out.println("******************************");
		return new JMXDemo();
	}

	@Bean
	AnnotationJmxAttributeSource jmxAttributeSource() {
		return new AnnotationJmxAttributeSource();
	}

	@Bean
	MetadataMBeanInfoAssembler assembler(AnnotationJmxAttributeSource annotationJmxAttributeSource) {
		MetadataMBeanInfoAssembler result = new MetadataMBeanInfoAssembler();
		result.setAttributeSource(annotationJmxAttributeSource);
		return result;
	}
	@Bean
	MetadataNamingStrategy namingStrategy(AnnotationJmxAttributeSource annotationJmxAttributeSource) {
		MetadataNamingStrategy result = new MetadataNamingStrategy();
		result.setAttributeSource(annotationJmxAttributeSource);
		return result;
	}

	@Bean
	MBeanExporter exporter(MetadataNamingStrategy metadataNamingStrategy, MetadataMBeanInfoAssembler metadataMBeanInfoAssembler) {
		MBeanExporter result = new MBeanExporter();
		result.setAutodetect(true);
		result.setNamingStrategy(metadataNamingStrategy);
		result.setAssembler(metadataMBeanInfoAssembler);
		return result;
	}


}
