# Rahul Ranjan CV Application

A modern Spring Boot web application that serves Rahul Ranjan's CV/Resume in a clean, responsive web format. This application transforms a traditional LaTeX CV into an interactive, professional web interface.

## 🌟 Features

- **Clean, Professional Web Interface** - Modern design with responsive layout
- **Multiple View Options** - Standard, compact, and simple layouts
- **Mobile Responsive** - Optimized for all screen sizes
- **Print-Friendly** - Professional styling for PDF generation
- **Fast Performance** - Embedded Tomcat server with quick startup
- **Easy Customization** - Modular design for easy content updates

## 📊 CV Sections Displayed

- **Personal Information & Contact Details**
- **Research Interests** - AI, Biomedical Signal Processing, ML, Computer Vision
- **Education** - Monash University (Master's), BITS Pilani (Bachelor's + Master's)
- **Technical Skills** - Programming languages, frameworks, tools, and domains
- **Publications** - Research papers and academic contributions
- **Research Experience** - CRIS internship and Master's thesis
- **Technical Projects** - LLM platform and biomedical research
- **Industry Experience** - Aglow Engineers and Xilinx/AMD roles
- **Awards & Recognition** - Duke of Edinburgh Award and achievements
- **Public Profiles** - LinkedIn and professional links

## 🛠 Technology Stack

- **Backend:** Java 17, Spring Boot 3.2.7
- **Frontend:** Thymeleaf, HTML5, CSS3
- **Build Tool:** Maven 3.6+
- **Server:** Embedded Tomcat
- **Architecture:** Model-View-Controller (MVC)

## 📁 Project Structure

```
src/
├── main/
│   ├── java/com/rahul/cvapp/
│   │   ├── CvApplication.java              # Main Spring Boot application
│   │   ├── controller/
│   │   │   └── CVController.java           # Web controller with multiple endpoints
│   │   ├── model/                          # Data models
│   │   │   ├── CV.java                     # Main CV model
│   │   │   ├── PersonalInfo.java           # Personal information
│   │   │   ├── Education.java              # Education details
│   │   │   ├── TechnicalSkills.java        # Skills information
│   │   │   ├── Publication.java            # Publication details
│   │   │   ├── Experience.java             # Work/research experience
│   │   │   ├── Project.java                # Technical projects
│   │   │   └── Award.java                  # Awards and recognition
│   │   └── service/
│   │       └── CVService.java              # Business logic and data service
│   └── resources/
│       ├── application.properties          # Configuration (port: 8081)
│       └── templates/                      # Thymeleaf templates
│           ├── cv.html                     # Original CV template
│           ├── cv-compact.html             # Compact view template
│           └── cv-simple.html              # Simple layout template (default)
├── pom.xml                                # Maven dependencies and build config
├── main.tex                               # Original LaTeX CV source
└── README.md                              # Project documentation
```

## 🚀 Getting Started

### Prerequisites

- **Java 17 or higher** - [Download OpenJDK](https://adoptium.net/)
- **Maven 3.6 or higher** - [Download Maven](https://maven.apache.org/download.cgi)

### Installation & Running

1. **Clone or navigate to the project directory:**
   ```bash
   cd /Users/rahul/Desktop/repos/App
   ```

2. **Build the project:**
   ```bash
   mvn clean compile
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the CV:**
   Open your web browser and navigate to:
   - Primary: `http://localhost:8081`
   - Alternative: `http://localhost:8081/cv/simple`

### Alternative: Run as JAR

1. **Package the application:**
   ```bash
   mvn clean package
   ```

2. **Run the JAR file:**
   ```bash
   java -jar target/cv-app-0.0.1-SNAPSHOT.jar
   ```

## 🌐 Available Endpoints

| Endpoint | Description | Template |
|----------|-------------|----------|
| `/` | Home page (Simple layout) | cv-simple.html |
| `/cv` | Original CV layout | cv.html |
| `/cv/simple` | Simple, clean layout | cv-simple.html |
| `/cv/compact` | Compact view | cv-compact.html |
| `/debug` | Debug data endpoint | JSON response |

## 🎨 Layout Options

### 1. Simple Layout (Default)
- **URL:** `http://localhost:8081`
- **Features:** Clean design, two-column layout, optimized spacing
- **Best for:** General viewing and presentations

### 2. Compact Layout
- **URL:** `http://localhost:8081/cv/compact`
- **Features:** Condensed formatting, smaller fonts, efficient space usage
- **Best for:** Single-page viewing and printing

### 3. Original Layout
- **URL:** `http://localhost:8081/cv`
- **Features:** Standard formatting with enhanced styling
- **Best for:** Traditional CV presentation

## ⚙️ Configuration

### Port Configuration
The application runs on port **8081** by default. To change the port, edit `src/main/resources/application.properties`:

```properties
server.port=8081
spring.application.name=cv-app
```

### Thymeleaf Configuration
Templates are configured for development with caching disabled:

```properties
spring.thymeleaf.cache=false
spring.thymeleaf.mode=HTML
spring.thymeleaf.encoding=UTF-8
```

## 🔧 Customization Guide

### Updating CV Content

1. **Personal Information:**
   - Edit `CVService.java` in the `getCV()` method
   - Update `PersonalInfo` object with new contact details

2. **Adding Experience:**
   - Add new `Experience` objects to research or industry experience lists
   - Include title, company, location, duration, and responsibilities

3. **Modifying Skills:**
   - Update `TechnicalSkills` object with new programming languages, frameworks, tools, or domains

4. **Adding Publications:**
   - Add new `Publication` objects with authors, title, journal, and links

### Styling Changes

1. **CSS Modifications:**
   - Edit the `<style>` section in the respective template files
   - Modify colors, fonts, spacing, or layout properties

2. **Layout Changes:**
   - Edit the HTML structure in template files
   - Use Thymeleaf syntax for dynamic content rendering

### Adding New Sections

1. **Create Model Class:**
   - Add new model class in `src/main/java/com/rahul/cvapp/model/`

2. **Update CV Model:**
   - Add new field to `CV.java` with getter/setter methods

3. **Update Service:**
   - Add data population in `CVService.java`

4. **Update Template:**
   - Add new section HTML in template files

## 🖨️ Printing and PDF Generation

The application includes print-friendly CSS that automatically optimizes the layout when printing:

- **Browser Print:** Use Ctrl+P (Cmd+P on Mac) to print or save as PDF
- **Optimized Layout:** Print styles remove shadows, adjust colors, and optimize spacing
- **Page Breaks:** CSS rules prevent awkward page breaks in content

## 🐛 Troubleshooting

### Common Issues

1. **Port Already in Use:**
   ```bash
   # Kill processes using port 8081
   lsof -ti:8081 | xargs kill -9
   ```

2. **Application Won't Start:**
   ```bash
   # Check Java version
   java -version
   
   # Verify Maven installation
   mvn -version
   ```

3. **Template Rendering Issues:**
   - Check `app.log` for Thymeleaf syntax errors
   - Verify all Thymeleaf expressions use correct syntax (`${...}`)

4. **Missing Content:**
   - Check `CVService.java` for data population
   - Verify template loops and conditionals

### Logs and Debugging

- **Application Logs:** Check `app.log` in the project directory
- **Debug Endpoint:** Visit `/debug` to see raw data being loaded
- **Console Output:** Check terminal for startup errors

## 🚀 Deployment Options

### Local Development
- Run with `mvn spring-boot:run`
- Access at `http://localhost:8081`

### Production Deployment
1. **JAR Deployment:**
   ```bash
   mvn clean package
   java -jar target/cv-app-0.0.1-SNAPSHOT.jar
   ```

2. **Docker Deployment:**
   ```dockerfile
   FROM openjdk:17-jdk-slim
   COPY target/cv-app-0.0.1-SNAPSHOT.jar app.jar
   EXPOSE 8081
   ENTRYPOINT ["java", "-jar", "/app.jar"]
   ```

3. **Cloud Deployment:**
   - Compatible with Heroku, AWS, Azure, GCP
   - Set `server.port=${PORT:8081}` for cloud platforms

## 📝 Development Notes

- **Hot Reloading:** Template changes are reflected immediately when `spring.thymeleaf.cache=false`
- **Data Model:** All CV data is currently hardcoded in `CVService.java`
- **Responsive Design:** Uses CSS Grid and Flexbox for layout
- **Cross-Browser:** Compatible with modern browsers (Chrome, Firefox, Safari, Edge)

## 📄 License

This project is for personal use and demonstration purposes.

## 🤝 Contributing

This is a personal CV application. For improvements or suggestions:
1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## 📞 Contact

**Rahul Ranjan**
- Email: rahulrkm0038@gmail.com
- LinkedIn: [rahul-ranjan-b595891b1](https://www.linkedin.com/in/rahul-ranjan-b595891b1)
- Phone: +91 7997193400

---

*Built with ❤️ using Spring Boot and Thymeleaf*
