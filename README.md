# Electronics Shopping & Ordering Website

## 📌 Overview
Welcome to the **Electronics Shopping & Ordering Website**, a modern eCommerce platform tailored for the sale and ordering of electronic devices. Built on the **MVC (Model-View-Controller) architecture**, this project follows a clean and modular structure, ensuring scalability, maintainability, and high performance. This platform seamlessly connects customers with vendors through an intuitive and secure shopping experience. From browsing products to placing orders and managing inventory, every aspect of the system is designed 
for efficiency. Whether you are an admin, vendor, or customer, our role-based dashboards provide personalized access to the necessary functionalities.
😊 I am pleased to present my thesis project, which demonstrates my ability to develop. This project reflects my technical skills, problem-solving abilities, and commitment to delivering high-quality solutions.😊
[My essay](https://drive.google.com/drive/folders/19RC_xY3HdxMmHLeJPO2ByDf0rXoQuzgW?usp=sharing)
## 🚀 Features
- **Protected Routes with Middleware**
- **Live Chat Feature (User-Vendor, Vendor-Admin)**
- **Wishlist & Add to Cart Functionality**
- **Separate Dashboards for Users, Vendors, and Admins**
- **Advanced Checkout System with Stripe**
- **Product Review & Rating System**
- **Stock Management for Out-of-Stock Products**
- **Secure Authentication & Authorization**
- **Cloudinary Integration for Image Uploads**
- **Real-time Notifications with Socket.io**
- **Responsive Design for All Devices**
## Test Account
- ✉️ Admin Account: khoitk14033@gmail.com | 🔑 Password: Banda147/
- ✉️ Seller Account: seller@gmail.com | 🔑 Password: Seller123/
- ✉️ Seller Account: seller1@gmail.com | 🔑 Password: Seller1234/
- ✉️ Customer Account: customer@gmail.com | 🔑 Password: Customer123/
## Demo:
- Admin: https://ecomerce-dashboard-kappa.vercel.app/admin/login
- Vendor: https://ecomerce-dashboard-kappa.vercel.app/login
- Customer: https://hqk-shop.vercel.app

## 📂 Project Structure
```
project-folder/
│── frontend/            # React.js Frontend
│   ├── src/
│   │   ├── components/  # Functional components
│   │   ├── pages/       # Page views
│   │   ├── store/       # Redux store configuration
│   │   │   ├── reducers/ # Reducers for state management
│   │   ├── api/         # API calls
│   │   ├── assets/      # Images
│   │   ├── utils/       # Utility functions
│   │   └── App.js       # Main React App
│   │
│── dashboard/            # React.js Frontend
│   ├── src/
│   │   ├── components/  # Functional components
│   │   ├── pages/       # Page views
│   │   ├── store/       # Redux store configuration
│   │   │   ├── reducers/ # Reducers for state management
│   │   ├── api/         # API calls
│   │   ├── assets/      # Images
│   │   ├── layout/      # Layout components
│   │   ├── navigation/  # Navigation components
│   │   ├── view/        # View components
│   │   └── App.js       # Main React App
│   │ 
│── backend/             # Express.js Backend
│   ├── controllers/    # Business logic
│   ├── middleware/     # Middleware for authentication
│   ├── models/         # Database models (MongoDB)
│   ├── routes/         # API Routes
│   ├── utils/          # Utility functions
│   ├── package.json    # Dependencies and scripts
│   ├── .env            # Configuration files
│   └── server.js       # Main entry point
```

## 🔧 Recommended Extensions
To enhance development productivity, consider installing the following extensions:
- **ESLint** - Linting and code formatting
- **Prettier** - Code formatting
- **Tailwind CSS IntelliSense** - Autocompletion for Tailwind CSS
- **MongoDB for VS Code** - Manage MongoDB databases within VS Code
- **REST Client** - API testing directly in VS Code
- **Auto Close Tag** - Automatically closes HTML/JSX tags
- **Auto Import - ES6, TS, JSX, TSX** - Automatically imports modules
- **Auto Rename Tag** - Renames paired HTML/JSX tags simultaneously
- **npm Intellisense** - Autocompletes npm modules
- **Path Intellisense** - Provides file path autocompletion
- **Reactjs Code Snippets** - Code snippets for React.js development
- **Snipped** - Custom snippets extension
- **Stylelint** - Lints CSS and SCSS files
- **Thunder Client** - Lightweight API client for testing requests
- **VSCode React Refactor** - Refactoring tools for React components


## 🤝 Installation & Setup
### 1. Development Environment
- Recommended IDEs:
  - [Download Visual Studio Code](https://code.visualstudio.com/)
- Required tools:
  - [Download Node.js](https://nodejs.org/)
  - [Download MongoDB](https://www.mongodb.com/try/download/community)
  - [Download Git](https://git-scm.com/downloads)

### 2. Clone the repository
```sh
git clone https://github.com/websitecuakhoi/ShopLinhKienDienTu.git
```

### 3. Install dependencies
#### Backend Setup
```sh
cd backend
npm install
```
#### Frontend Setup
```sh
cd frontend
npm install
```

### 4. Configure Environment Variables
Create a `.env` file in both `backend/` directories and configure necessary variables:

#### Backend `.env`
```plaintext
PORT = 5000
mode = local
DB_LOCAL_URL = your_mongodb_connection_string
SECRET = khoitk
cloud_name=your_cloudinary_name
api_key=your_api_key
api_secret=your_api_secret
```

### 5. Start the Application
#### Run Backend Server
```sh
cd backend
npm run server
```
#### Run Frontend
```sh
cd frontend
npm run start
```
The application will be accessible at `http://localhost:3000`

## Screenshots:

### Product Details Page:
![Alt text](https://res.cloudinary.com/dd7fcqtnn/image/upload/v1739954313/product_details_vwikci.png)

### Card Page:
![Alt text](https://res.cloudinary.com/dd7fcqtnn/image/upload/v1739955077/product_card_rcszh0.png)

### Payment Page:
![Alt text](https://res.cloudinary.com/dd7fcqtnn/image/upload/v1739955075/payment_Page_nzkglt.png)
### 6. Troubleshooting
If you encounter any issues, check the following:
- Ensure Node.js is installed (`node -v` to verify).
- Check MongoDB connection in your `.env` file.
- Review console logs for any dependency errors.


---
### ⚡️ Revolutionizing Electronics Shopping Experience! 🛍️🔋
