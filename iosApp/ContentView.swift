import SwiftUI

private let primaryColor = Color(red: 98/255.0, green: 0/255.0, blue: 238/255.0)

struct ContentView: View {
    var body: some View {
        TabView {
            Text("Home")
                .foregroundColor(primaryColor)
                .font(.title)
                .tabItem { Label("Home", systemImage: "house") }

            Text("Gallery")
                .foregroundColor(primaryColor)
                .font(.title)
                .tabItem { Label("Gallery", systemImage: "photo.on.rectangle") }

            Text("Mine")
                .foregroundColor(primaryColor)
                .font(.title)
                .tabItem { Label("Mine", systemImage: "person") }
        }
    }
}
