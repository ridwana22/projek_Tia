document.addEventListener("DOMContentLoaded", function () {
    var form = document.getElementById("stress-prediction-form");

    form.addEventListener("submit", function (event) {
        event.preventDefault(); // Prevent default form submission

        var data = {
            studyHoursPerDay: document.getElementById("studyHours").value,
            extracurricularHoursPerDay: document.getElementById("extracurricularHours").value,
            sleepHoursPerDay: document.getElementById("sleepHours").value,
            socialHoursPerDay: document.getElementById("socialHours").value,
            physicalActivityHoursPerDay: document.getElementById("physicalActivityHours").value,
            gpa: document.getElementById("gpa").value
        };

        // Mengirim data ke endpoint Spring Boot
        fetch("/api/student/predict", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data)
        })
        .then(response => response.json())
        .then(data => {
            document.getElementById("result").innerText = `Predicted Stress Level: ${data.output}`;
        })
        .catch(error => {
            document.getElementById("result").innerText = `Error: ${error.message}`;
        });
    });
});
